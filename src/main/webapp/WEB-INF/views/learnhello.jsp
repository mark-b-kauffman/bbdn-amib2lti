<%-- Copyright (C) 2016, Blackboard Inc.
 * All rights reserved.
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  -- Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *  -- Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *  -- Neither the name of Blackboard Inc. nor the names of its contributors
 *     may be used to endorse or promote products derived from this
 *     software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY BLACKBOARD INC ``AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL BLACKBOARD INC. BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 --%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/bbNG" prefix="bbNG"%>

<bbNG:learningSystemPage ctxId="ctx" title="Hello From Blackboard Learn!" hideCourseMenu="false">
<meta http-equiv="refresh" content="20" />

<%@ page session="false" %>
<html>
<head>
	<title>Hello From Blackboard Learn!</title>
</head>
<body>
<h1>
	Hello from Blackboard Learn!
</h1>

<P>  The time on the server is ${serverTime}. </P>

<P>  INSTANCE_GUID is ${INSTANCE_GUID}. </P>
<P> The uriStem is ${uriStem}. </P>

<P>  Your b2Vendor-b2Handle is: ${b2Vendor}-${b2Handle} </P>

<P>  Your uriStem is: ${uriStem} </P>

<P>  Your blackboard.data.user.User.getUserName() is: ${userName} </P>
<P>  Your blackboard.data.user.User.getBatchUid() is: ${batchUid} </P>

</body>
</html>

</bbNG:learningSystemPage>
