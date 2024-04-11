<%@include file="header.jsp"%>
    <h2>Welcome to My Online Shop Home Page.</h2><br>
    <form method="get" target='_blank' action="search">
    <input type="text" name="txt" size=30/>
    <select name="search">
        <option value="baidu">baidu</option>
        <option value="WeiDinghuan">WeiDinghuan</option>
        <option value="google">Google</option>
    </select>
        <input type="submit" value="Search"/>
    </form>
<%@include file="footer.jsp"%>