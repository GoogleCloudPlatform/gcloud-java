<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<title>google-cloud-java managed environments tests executor</title>
<body>
<p>Enter fully qualified test class names to execute. One class per line, use '#' for comments.</p>
<form method="POST" action="/test">
    <label>
        <textarea name="classes" cols="50"
                  rows="10">#com.google.cloud.storage.BlobIdTest</textarea>
    </label>
    <br/>
    <input type="submit"/>
</form>
</body>
</html>
