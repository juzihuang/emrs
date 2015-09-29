

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head >
    <title>测试ajax</title>
    <script src="js/jquery-1.4.1.js" type="text/javascript"></script>
    <script type="text/javascript" language="javascript">
        function  testAjax() {
            $.ajax({
                type: "POST",
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                url: "http://10.103.30.138:8080/emrs/login/getAdmEmployeeList",//传入后台的地址/方法
                data: "{'RID':'123'}",//参数，这里是一个json语句
                success: function (data) {
                    var result = data.d;
                    alert(result);
                },
                error: function (err) {
                    alert("err:" + err);
                }
            });
        }
    </script>
</head>
<body>
    <form id="form1">
    <div>
        <button onclick="testAjax();">用button测试ajax</button>
        <input type="button" value="testAjax" onclick="testAjax();" />
    </div>
    </form>
</body>
</html>