<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

[
	<c:forEach var="i" items="${loanRateList}" varStatus="j">
	{
	"loanRateId":"${i.id}",
	"loanRate":"${i.loanRate}"
	}
	</c:forEach>
]