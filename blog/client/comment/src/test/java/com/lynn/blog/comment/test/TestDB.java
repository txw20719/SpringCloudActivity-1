package com.lynn.blog.comment.test;

import com.lynn.blog.comment.CommentApplication;
import com.lynn.blog.comment.domain.request.CommentListRequest;
import com.lynn.blog.comment.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CommentApplication.class)
public class TestDB {

    @Autowired
    private CommentService commentService;

    @Test
    public void test(){
        try {
//            CommentAddRequest request = new CommentAddRequest();
//            request.setBlogId(1L);
//            request.setContent("不错！");
//            request.setParentId(0L);
//            System.out.println(commentService.addComment(request,1L));
            CommentListRequest request = new CommentListRequest();
            request.setPageNumber(1);
            request.setPageSize(10);
            request.setBlogId(1L);
            System.out.println(commentService.getCommentList(request));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
