package com.matrix.matrix158springpracticeapp.service.implementation;

import com.matrix.matrix158springpracticeapp.dto.request.UserRequestDto;
import com.matrix.matrix158springpracticeapp.dto.response.UserResponseDto;
import com.matrix.matrix158springpracticeapp.entity.User;
import com.matrix.matrix158springpracticeapp.exception.AlreadyExistsException;
import com.matrix.matrix158springpracticeapp.exception.EntityNotFoundException;
import com.matrix.matrix158springpracticeapp.mapper.UserMapper;
import com.matrix.matrix158springpracticeapp.repository.UserRepository;
import com.matrix.matrix158springpracticeapp.service.interfaces.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    @Override
    public UserResponseDto getById(Integer id) {
        log.info("getById method is started");
        User user =  userRepository.findById(id).orElseThrow(()->new EntityNotFoundException("There isn't any user in this id"));
        log.info("getById method is done");
        return userMapper.toUserResponseDto(user);
    }

    @Override
    public List<UserResponseDto> getAll() {
        log.info("getAll method is started");
        List<User> userList =  userRepository.findAll();
        log.info("getAll method is done");
        return userList.stream().map(userMapper::toUserResponseDto).toList();
    }

    @Override
    public UserResponseDto add(UserRequestDto userRequestDto) {
        Optional<User> user = userRepository.findByUsername(userRequestDto.getUsername());
        if(user.isPresent()){
            log.error("This user is already exist");
            throw new AlreadyExistsException("This user that has username "+ userRequestDto.getUsername()+" is already exist");
        }
        User newUser = userMapper.toUser(userRequestDto);
        return userMapper.toUserResponseDto(newUser);
    }

    @Override
    public void update(UserRequestDto userRequestDto,Integer id) {
        log.info("update method is started");
        User user = userRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("There isn't any user in this id"));
        user.setName(userRequestDto.getName());
        user.setSurname(userRequestDto.getSurname());
        user.setEmail(userRequestDto.getEmail());
        user.setUsername(userRequestDto.getUsername());
        user.setPassword(userRequestDto.getPassword());
        userRepository.save(user);
        log.info("User is successfully updated");
    }

    @Override
    public void deleteById(Integer id) {
        log.info("delete method is started");
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
        }
        log.info("user is successfully deleted");
    }
}
