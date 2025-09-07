<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Digital Clock</title>
    <style>
        body {
            background: #0d0d0d;
            color: #00ff99;
            font-family: "Courier New", monospace;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .clock {
            font-size: 60px;
            padding: 20px;
            border: 2px solid #00ff99;
            border-radius: 10px;
            box-shadow: 0 0 20px #00ff99;
        }
    </style>
</head>
<body>
    <div class="clock" id="clock">
        ${currentTime}
    </div>

    <script>
        // Refresh clock every second
        setInterval(() => {
            fetch("clock")
                .then(response => response.text())
                .then(html => {
                    document.open();
                    document.write(html);
                    document.close();
                });
        }, 1000);
    </script>
</body>
</html>
