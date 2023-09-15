<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ include file="../layouts/header.jsp"%>
<!-- summernote -->
<link rel="stylesheet"
	href="/resources/css/summernote/summernote-lite.min.css">
<script src="/resources/js/summernote/summernote-lite.min.js"></script>
<script src="/resources/js/summernote/lang/summernote-ko-KR.min.js"></script>
<script>
	$(document).ready(function() {
		$('#content').summernote({
			height : 300, // 에디터높이
			lang : "ko-KR",// 한글설정
		});

	});
	// 기본글꼴설정
	$('#content').summernote('fontName', 'Arial');
</script>
<%--개별페이지--%>
<h1 class="page-header">
	<i class="far fa-edit"></i>여행지 정보 수정
</h1>
<div class="panel panel-default">
	<div class="panel-heading">travel Register</div>
	<div class="panel-body">
		<form role="form" method="post">
			<input type="hidden" name="pageNum" value="${travel.no}">

			<!-- name은 travelVO에 있는 멤버변수 이름을 사용 -->
			<div class="form-group">
				<label>권역</label> <input name="region" class="form-control"
					value="${travel.region }">
			</div>
			<div class="form-group">
				<label>Region</label> <input name="title" class="form-control"
					value="${travel.title }">
			</div>
			
			<div class="form-group">
				<label>주소</label> <input name="address" class="form-control"
					value="${travel.address }">
			</div>
			
			<div class="form-group">
				<label>번호</label> <input name="phone" class="form-control"
					value="${travel.phone }">
			</div>
			
			<div class="form-group">
				<label>내용</label>
				<textarea class="form-control" id="content" name="description" rows="10">${travel.description }</textarea>
			</div>
			

			<button type="submit" class="btn btn-primary">
				<i class="fas fa-undo"></i>확인
			</button>
			<button type="reset" class="btn btn-primary">
				<i class="fas fa-undo"></i>취소
			</button>
			<a href="${cri.getLink('get', travel.no) }" class="btn btn-primary get"> <i class="fas fa-list"></i>돌아가기
			</a>
		</form>
	</div>
</div>


<%@ include file="../layouts/footer.jsp"%>