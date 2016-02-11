# JerseySQL
How to Configure and run project Successfuly:

1) Create Table website

CREATE TABLE  `website` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`title` text,
`description` text,
`url` text,
PRIMARY KEY (`id`)
);

2) Insert values 

insert into website(title,description,url) values('Google','Description Text','www.google.com');
insert into website(title,description,url) values('Facebook','Description Text','www.facebook.com');
insert into website(title,description,url) values('Wikipedia','Description Text','www.wikipedia.com');

3) Change your sql db settings inside dao.Database java file

	con = DriverManager
			.getConnection("jdbc:mysql://localhost:3306/prp_development","dbuser", "root123");


4) Clean and build project

5) Create war file and deploy to tomcat 

6) Run the following URL to test it

http://localhost:8080/JerseySQL/rest/message/GetFeeds
