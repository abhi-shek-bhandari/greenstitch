# GreenStitch.io


The Backend Application is using java version 17.

### Prerequisites
To run the application successfully you need to run the Spring Boot Server first in your local machine.

## Installation of Development server

After cloning the repo. Open the Project in your IDE.

Then Open the filename GreenstitchApplication.java which is inside the src/main/java/com/greenstitch/greenstitch/GreenstitchApplication.java

Then run the file by pressing the run icon near the main function.

Now Open your PostMan to use these APIs

Then you can use the 
`Post: http://localhost:5000/auth/signup` for User Signup

And in request body add these details

```
{
    "firstName": "Abhishek",
    "lastName": "bhandari",
    "email": "abhi2@gmail.com",
    "password": "abhi"
}
```

If your signup is successful then you can use

`Post: http://localhost:5000/auth/login` for User Login 

And in request body add these details

```
{
    "email": "abhi@gmail.com",
    "password": "abhi"
}
```

Then you will get the token in Response.

Now, this API will be Assessable through PostMan
`Get http://localhost:5000/hello` 

Select Authorization and then select Bearer Token and paste that token there.

Now, if you did it correctly you can now see the Message in Response.

### Authors
**Abhishek Bhandari** - *Initial work* - **[abhi-shek-bhandari](https://github.com/abhi-shek-bhandari)**