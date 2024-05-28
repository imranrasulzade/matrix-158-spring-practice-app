INSERT INTO mj_course_management.user_authorities (user_id, authority_name)
VALUES ((SELECT id FROM mj_course_management.mj_user WHERE username = 'admin'), 'ADMIN');