INSERT INTO user_authorities (user_id, authority_name)
VALUES ((SELECT id FROM mj_user WHERE username = 'admin'), 'ADMIN');