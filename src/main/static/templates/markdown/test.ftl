

<link rel="stylesheet" href="${static_resource}/static/editormd/css/editormd.preview.css" />
<div id="test-markdown-view">
    <!-- Server-side output Markdown text -->
    <textarea style="display:none;">${content}</textarea>
</div>
<script src="https://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
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