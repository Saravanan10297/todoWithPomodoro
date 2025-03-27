
  <%@ include file="common/header.jspf" %>
   <%@ include file="common/navigation.jspf" %>
  <div class="container">
    <h1>welcome to Add TODOS</h1>
    <form:form method="POST" modelAttribute="todo">
        <fieldset class="mb-3">
	        <form:label path="description">Descrption</form:label>
	        <form:input type="text" path="description" required="required"/>
	        <form:errors type="text" path="description" />
        </fieldset>
        
                <fieldset class="mb-3">
	        <form:label path="targeDate">Target Date</form:label>
	        <form:input type="text" path="targeDate" required="required"/>
	        <form:errors type="text" path="targeDate" />
        </fieldset>
        
        <form:input type="hidden" path="id"/>
        <form:input type="hidden" path="done"/>
        <input type="submit" class="btn btn-success"/>
    </form:form>

    <div>
        <script type="text/javascript">
    $('#targeDate').datepicker({
        format: 'yyyy-mm-dd'
       
    });
    </script>

<%@ include file="common/footer.jspf" %>
