package com.exam.entity;
//考试类
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("exam_question")
public class ExamQuestion {
    
    @TableId(type = IdType.AUTO)
    private Long id;
    
    private Long examId;
    
    private Long questionId;
    
    @TableField(exist = false)
    private Question question;
    
    private Integer sequence;
    
    private Integer score;
}
