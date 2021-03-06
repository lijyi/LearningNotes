<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="lijyi">
    <meta name="keyword" content="Java Notes">
    <link rel="shortcut icon" href="${static_resource}/static/img/favicon.ico">

    <title>学习笔记 - lijyi.com</title>

    <!-- Bootstrap core CSS -->
    <link href="${static_resource}/static/css/bootstrap.min.css" rel="stylesheet">
    <link href="${static_resource}/static/css/bootstrap-reset.css" rel="stylesheet">
    <!--external css-->
    <link href="${static_resource}/static/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />

    <!-- coming soon styles -->
    <link href="${static_resource}/static/css/soon.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${static_resource}/static/css/style.css" rel="stylesheet">
    <link href="${static_resource}/static/css/style-responsive.css" rel="stylesheet" />

    <link rel="stylesheet" href="${static_resource}/static/editormd/css/editormd.preview.css" />
</head>

<body class="cs-bg">
<!-- START HEADER -->
<section id="header">
    <div class="container">
        <header>
            <!-- HEADLINE -->
            <a class="logo floatless" href="index.html">学习<span>笔记</span></a>
            <br/>
            <div id="test-markdown-view">
                <!-- Server-side output Markdown text -->
                <textarea style="display:none;">${content}</textarea>
            </div>
        </header>
    </div>
</section>
<!-- END HEADER -->
<section id="container" class="">
    <div style="height: 150px">

    </div>
    <!--footer start-->
    <footer class="site-footer">
        <div class="text-center">
            <a target="_blank" href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=12010202000416" style="color:white"><img src="${static_resource}/static/img/beian.png"/>津公网安备 12010202000416号</a>
            <a target="_blank" href="http://www.beian.miit.gov.cn/" style="color:white">津ICP备19007293号</a>
            <a href="#" class="go-top">
                <i class="fa fa-angle-up"></i>
            </a>
        </div>
    </footer>
    <!--footer end-->
</section>

<!-- Placed at the end of the document so the pages load faster -->
<script src="${static_resource}/static/js/jquery.js"></script>
<script type="text/javascript" src="${static_resource}/static/js/modernizr.custom.js"></script>
<script src="${static_resource}/static/js/bootstrap.min.js"></script>

<script src="${static_resource}/static/editormd/editormd.js"></script>
<script src="${static_resource}/static/editormd/lib/marked.min.js"></script>
<script src="${static_resource}/static/editormd/lib/prettify.min.js"></script>
<script type="text/javascript">
    $(function() {
        var testView = editormd.markdownToHTML("test-markdown-view", {
            // markdown : "[TOC]\n### Hello world!\n## Heading 2", // Also, you can dynamic set Markdown text
            htmlDecode : true,  // Enable / disable HTML tag encode.
            htmlDecode : "style"  // Note: If enabled, you should filter some dangerous HTML tags for website security.
        });
    });
</script>


</body>
<!-- END BODY -->
</html>