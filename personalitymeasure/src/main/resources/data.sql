CREATE TABLE CATEGORIES (
   id LONG NOT NULL,
   name VARCHAR(50) NOT NULL,
   description VARCHAR(20) NOT NULL
);

CREATE TABLE QUESTIONS (
   id LONG NOT NULL,
   question VARCHAR(250) NOT NULL,
   category_id LONG NOT NULL,
   type_name VARCHAR(250) NOT NULL,
   is_conditional BOOLEAN NOT NULL
);

CREATE TABLE OPTIONS (
   id LONG NOT NULL,
   question_id LONG NOT NULL,
   option_name VARCHAR(250) NOT NULL,
   condition_id LONG NOT NULL
);
CREATE TABLE ANSWERS(
  id LONG NOT NULL,
  user_id LONG NOT NULL,
  question_id LONG NOT NULL,
  option_id LONG NOT NULL,
  answer VARCHAR(250) NOT NULL
);

INSERT INTO CATEGORIES  VALUES (1, 'hard_fact','Hard Fact');
INSERT INTO CATEGORIES  VALUES (2, 'lifesstyle','Life Style');
INSERT INTO CATEGORIES  VALUES (3, 'introversion','Introversion');
INSERT INTO CATEGORIES  VALUES (4, 'passion','Passion');


INSERT INTO OPTIONS  VALUES (1, '1','Male',0);
INSERT INTO OPTIONS  VALUES (2, '1','Female',0);
INSERT INTO OPTIONS  VALUES (3, '1','Other',0);

INSERT INTO OPTIONS  VALUES (4, '2','not important',0);
INSERT INTO OPTIONS  VALUES (5, '2','important',0);
INSERT INTO OPTIONS  VALUES (6, '2','very important',0);

INSERT INTO OPTIONS  VALUES (7, '3','not important',0);
INSERT INTO OPTIONS  VALUES (8, '3','important',0);
INSERT INTO OPTIONS  VALUES (9, '3','very important',4);

INSERT INTO OPTIONS  VALUES (10, '4','from 18 to 140',0);

INSERT INTO OPTIONS  VALUES (11, '5','yes',0);
INSERT INTO OPTIONS  VALUES (12, '5','sometimes',0);
INSERT INTO OPTIONS  VALUES (13, '5','no',0);

INSERT INTO OPTIONS  VALUES (11, '6','yes',0);
INSERT INTO OPTIONS  VALUES (12, '6','sometimes',0);
INSERT INTO OPTIONS  VALUES (13, '6','no',0);

INSERT INTO OPTIONS  VALUES (14, '7','yes',0);
INSERT INTO OPTIONS  VALUES (15, '7','sometimes',0);
INSERT INTO OPTIONS  VALUES (16, '7','no',0);

INSERT INTO OPTIONS  VALUES (17, '8','yes',0);
INSERT INTO OPTIONS  VALUES (18, '8','sometimes',0);
INSERT INTO OPTIONS  VALUES (19, '8','no',0);

INSERT INTO OPTIONS  VALUES (20, '9','never married',0);
INSERT INTO OPTIONS  VALUES (21, '9','separated',0);
INSERT INTO OPTIONS  VALUES (22, '9','divorced',0);
INSERT INTO OPTIONS  VALUES (22, '9','widowed',0);

INSERT INTO OPTIONS  VALUES (23, '10','never',0);
INSERT INTO OPTIONS  VALUES (24, '10','once or twice a year',0);
INSERT INTO OPTIONS  VALUES (25, '10','once or twice a month',0);
INSERT INTO OPTIONS  VALUES (26, '10','once or twice a week',0);
INSERT INTO OPTIONS  VALUES (27, '10','I m drinking my 3rd mojito now, and it is only 11am',0);

INSERT INTO OPTIONS  VALUES (28, '11','never',0);
INSERT INTO OPTIONS  VALUES (29, '11','once or twice a year',0);
INSERT INTO OPTIONS  VALUES (30, '11','socially',0);
INSERT INTO OPTIONS  VALUES (31, '11','frequently',0);

INSERT INTO OPTIONS  VALUES (32, '12','I m completely opposed',0);
INSERT INTO OPTIONS  VALUES (33, '12','I ve been know to dabble',0);
INSERT INTO OPTIONS  VALUES (34, '12','drugs enrich my life',0);

INSERT INTO OPTIONS  VALUES (35, '13','friendship',0);
INSERT INTO OPTIONS  VALUES (36, '13','a hot date',0);
INSERT INTO OPTIONS  VALUES (37, '13','an affair',0);
INSERT INTO OPTIONS  VALUES (38, '13','a short-term relationship',0);
INSERT INTO OPTIONS  VALUES (39, '13','a long-term relationship',0);

INSERT INTO OPTIONS  VALUES (40, '14','yes',0);
INSERT INTO OPTIONS  VALUES (41, '14','probably',0);
INSERT INTO OPTIONS  VALUES (42, '14','eventually',0);
INSERT INTO OPTIONS  VALUES (43, '14','no',0);

INSERT INTO OPTIONS  VALUES (44, '15','cohabitation',0);
INSERT INTO OPTIONS  VALUES (45, '15','separate flat / room in the same building',0);
INSERT INTO OPTIONS  VALUES (46, '15','separate flats in the same area',0);
INSERT INTO OPTIONS  VALUES (47, '15','weekend-relationship',0);
INSERT INTO OPTIONS  VALUES (48, '15','long distance relationship',0);

INSERT INTO OPTIONS  VALUES (49, '16','most of the time',0);
INSERT INTO OPTIONS  VALUES (50, '16','often',0);
INSERT INTO OPTIONS  VALUES (51, '16','sometimes',0);
INSERT INTO OPTIONS  VALUES (52, '16','rarely',0);
INSERT INTO OPTIONS  VALUES (53, '16','not at all',0);

INSERT INTO OPTIONS  VALUES (54, '17','most of the time',0);
INSERT INTO OPTIONS  VALUES (55, '17','often',0);
INSERT INTO OPTIONS  VALUES (56, '17','sometimes',0);
INSERT INTO OPTIONS  VALUES (57, '17','rarely',0);
INSERT INTO OPTIONS  VALUES (58, '17','not at all',0);

INSERT INTO OPTIONS  VALUES (59, '18','most of the time',0);
INSERT INTO OPTIONS  VALUES (60, '18','often',0);
INSERT INTO OPTIONS  VALUES (61, '18','sometimes',0);
INSERT INTO OPTIONS  VALUES (62, '18','rarely',0);
INSERT INTO OPTIONS  VALUES (63, '18','not at all',0);

INSERT INTO OPTIONS  VALUES (64, '19','most of the time',0);
INSERT INTO OPTIONS  VALUES (65, '19','often',0);
INSERT INTO OPTIONS  VALUES (66, '19','sometimes',0);
INSERT INTO OPTIONS  VALUES (67, '19','rarely',0);
INSERT INTO OPTIONS  VALUES (68, '19','not at all',0);

INSERT INTO OPTIONS  VALUES (69, '20','most of the time',0);
INSERT INTO OPTIONS  VALUES (70, '20','often',0);
INSERT INTO OPTIONS  VALUES (71, '20','sometimes',0);
INSERT INTO OPTIONS  VALUES (72, '20','rarely',0);
INSERT INTO OPTIONS  VALUES (73, '20','not at all',0);

INSERT INTO OPTIONS  VALUES (74, '21','a few times a day',0);
INSERT INTO OPTIONS  VALUES (75, '21','daily',0);
INSERT INTO OPTIONS  VALUES (76, '21','a few times a week',0);
INSERT INTO OPTIONS  VALUES (77, '21','a few times a month',0);
INSERT INTO OPTIONS  VALUES (78, '21','rarely',0);

INSERT INTO OPTIONS  VALUES (79, '22','less than a day',0);
INSERT INTO OPTIONS  VALUES (80, '22','one day',0);
INSERT INTO OPTIONS  VALUES (81, '22','one week',0);
INSERT INTO OPTIONS  VALUES (82, '22','one month',0);
INSERT INTO OPTIONS  VALUES (83, '22','I d never do something like that',0);

INSERT INTO OPTIONS  VALUES (84, '23','every day',0);
INSERT INTO OPTIONS  VALUES (85, '23','a few times a week',0);
INSERT INTO OPTIONS  VALUES (86, '23','every two weeks',0);
INSERT INTO OPTIONS  VALUES (87, '23','once a week',0);
INSERT INTO OPTIONS  VALUES (88, '23','infrequently',0);

INSERT INTO OPTIONS  VALUES (89, '24','every day',0);
INSERT INTO OPTIONS  VALUES (90, '24','a few times a week',0);
INSERT INTO OPTIONS  VALUES (91, '24','every two weeks',0);
INSERT INTO OPTIONS  VALUES (92, '24','once a week',0);
INSERT INTO OPTIONS  VALUES (93, '24','infrequently',0);

INSERT INTO OPTIONS  VALUES (94, '25','every day',0);
INSERT INTO OPTIONS  VALUES (95, '25','a few times a week',0);
INSERT INTO OPTIONS  VALUES (96, '25','every two weeks',0);
INSERT INTO OPTIONS  VALUES (97, '25','once a week',0);
INSERT INTO OPTIONS  VALUES (98, '26','infrequently',0);
INSERT INTO OPTIONS  VALUES (99, '26','every day',0);
INSERT INTO OPTIONS  VALUES (100, '26','a few times a week',0);
INSERT INTO OPTIONS  VALUES (101, '26','every two weeks',0);
INSERT INTO OPTIONS  VALUES (102, '26','once a week',0);


INSERT INTO QUESTIONS  VALUES (1, 'What is your gender?','1','single_choice',false);
INSERT INTO QUESTIONS  VALUES (2, 'How important is the gender of your partner?','1','single_choice',false);
INSERT INTO QUESTIONS  VALUES (3, 'How important is the age of your partner to you?','1','single_choice_conditional',false);
INSERT INTO QUESTIONS  VALUES (4, 'What age should your potential partner be?','1','number_range',true);
INSERT INTO QUESTIONS  VALUES (5, 'Do any children under the age of 18 live with you?','1','single_choice',false);
INSERT INTO QUESTIONS  VALUES (6, 'How should your potential partner respond to this question?','2','single_choice',false);
INSERT INTO QUESTIONS  VALUES (7, 'Could you imagine having children with your potential partner?','2','single_choice',false);
INSERT INTO QUESTIONS  VALUES (8, 'How should your potential partner respond to this question?','2','single_choice',false);
INSERT INTO QUESTIONS  VALUES (9, 'What is your marital status?','1','single_choice',false);
INSERT INTO QUESTIONS  VALUES (10, 'How often do your drink alcohol?','2','single_choice',false);
INSERT INTO QUESTIONS  VALUES (11, 'How often do you smoke?','2','single_choice',false);
INSERT INTO QUESTIONS  VALUES (12, 'What is your attitude towards drugs?','2','single_choice',false);
INSERT INTO QUESTIONS  VALUES (13, 'You are looking for...','2','single_choice',false);
INSERT INTO QUESTIONS  VALUES (14, 'Would you like to get married?','2','single_choice',false);
INSERT INTO QUESTIONS  VALUES (15, 'What is your ideal living arrangement?','2','single_choice',false);
INSERT INTO QUESTIONS  VALUES (16, 'Do you enjoy spending time alone?','3','single_choice',false);
INSERT INTO QUESTIONS  VALUES (17, 'When you are alone, do you get lonely quickly?','3','single_choice',false);
INSERT INTO QUESTIONS  VALUES (18, 'Do you enjoy going on holiday by yourself?','3','single_choice',false);
INSERT INTO QUESTIONS  VALUES (19, 'I consciously take me time','3','single_choice',false);
INSERT INTO QUESTIONS  VALUES (20, 'Should one keep little secrets from one is partner?','3','single_choice',false);
INSERT INTO QUESTIONS  VALUES (21, 'How often do you think about sex?','4','single_choice',false);
INSERT INTO QUESTIONS  VALUES (22, 'If you were alone on a desert island, how long would you last before pleasuring yourself?','4','single_choice',false);
INSERT INTO QUESTIONS  VALUES (23, 'How often would you like to have sex with your prospective partner?','4','single_choice',false);
INSERT INTO QUESTIONS  VALUES (24, 'Do you like trying out new things in bed and  experimenting','4','single_choice',false);
INSERT INTO QUESTIONS  VALUES (25, 'I can enjoy sex without love','4','single_choice',false);
INSERT INTO QUESTIONS  VALUES (26, 'For me, a stable relationship is a prerequisite for really good sex','4','single_choice',false);