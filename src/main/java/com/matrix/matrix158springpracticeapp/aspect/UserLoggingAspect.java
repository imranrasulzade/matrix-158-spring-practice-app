//package com.matrix.matrix158springpracticeapp.aspect;
//
//import com.matrix.matrix158springpracticeapp.entity.User;
//import com.matrix.matrix158springpracticeapp.entity.UserLog;
//import com.matrix.matrix158springpracticeapp.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import lombok.SneakyThrows;
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDate;
//import java.util.Optional;
//
//@Slf4j
//@Aspect
//@Component
//@Configurable
//@RequiredArgsConstructor
//public class UserLoggingAspect {
////    private final UserLogRepository userLogRepository; //yaradilacaq
//    private final UserRepository userRepository;

//      DEPENDENCY
//    https://mvnrepository.com/artifact/org.aspectj/aspectjrt
//    runtimeOnly group: 'org.aspectj', name: 'aspectjrt', version: '1.9.22'


//    @SneakyThrows
//    @AfterReturning("execution(* com.matrix.matrix158springpracticeapp.service.implementation.AuthServiceImpl.authenticate(..))")
//    public void logSignIn(JoinPoint joinPoint) {
//        UserLog userLog = new UserLog();
//        LoginReq loginReq = (LoginReq) joinPoint.getArgs()[0];
//        String username = loginReq.getUsername();
//
//        Optional<User> userOptional = userRepository.findByUsername(username);
//        if (userOptional.isPresent()) {
//            User user = userOptional.get();
//            userLog.setUser(user);
//            userLog.setLastLoginDate(LocalDate.now());
//            userLogRepository.save(userLog);
//            log.info("client login logged with aspect");
//        }
//    }
//}