<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h1>
        Students
    </h1>
    <#list students as student>
        <div>
            ${student.name} ${student.groupName}
        </div>
    </#list>
    <form method="post">
        <input type="text" placeholder="Student Name" name="name">
        <input type="text" placeholder="Student Group" name="groupName">
        <input type="submit" value="Save">
    </form>
</body>
</html>