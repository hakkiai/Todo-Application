<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #d5f5fd;
    text-align: center;
    padding: 100px;
  }
  
  .login-container {
    max-width: 400px;
    margin: auto;
    background-color: #fdfcfe;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  }
  
  input {
    width: 100%;
    padding: 10px;
    margin: 8px 0;
    box-sizing: border-box;
  }
  
  button {
    background-color: #4caf50;
    color: #fff;
    padding: 10px 15px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
  }
</style>
</head>
<body>
	
<!-- 	<form method="post">
    <h1>Welcome to my website</h1>
    <div>Name:<input type="text" name="name"></div>
    <div>Password:<input type="password" name="password"></div>
    <div class="button"><input type="submit"></div>
    </form>-->

  <div class="login-container">
    <h2>Login</h2>
    <form method="post">
      <label for="name">Username:</label>
      <input type="text" id="name" name="name" required>

      <label for="password">Password:</label>
      <input type="password" id="password" name="password">

      <button type="submit">Login</button>
    </form>
  </div>

<pre>${error}</pre>

</body>
</html>  