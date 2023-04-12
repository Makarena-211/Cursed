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
<div>
    <table>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Sirname</th>
            <th>Birthdate</th>
        </tr>
        <#list passangers as passanger>
            <tr>
                <td>${passanger.id}</td>
                <td>${passanger.name}</td>
                <td>${passanger.sirname}</td>
                <td>${passanger.birthdate}</td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>