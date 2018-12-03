# User-app-api

###User Registration and Login

##Steps to Setup the Spring Boot Back end app (user-app-api)

1. **Clone the application**

		Download the project source code from https://github.com/BharathAlli/usersApplication
		
		 or clone the project git clone https://github.com/BharathAlli/usersApplication

	
	cd users-app-api
	```

2. **Create MySQL database**

		create database users_app_db

3. **Change MySQL username and password as per your MySQL installation**

			+ open `src/main/resources/application.properties` file.

			+ change `spring.datasource.username` and `spring.datasource.password` properties as per your mysql installation

4. **Run the app**

	###Build Application
	
	select user-app-api in Eclipse and maven build 'clean install'

			Open command line in the project root folder.
	 
			Example: > cd c:\Desktop\users-app-api
					 > c:\Desktop\users-app-api> mvn spring-boot:run
	 
			The server will start on port 5000.
			
5. **Go to users-app-client and follow README.md**
	