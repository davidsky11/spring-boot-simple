package com.kvlt.boot.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * MyFirstTasklet
 *
 * @author KVLT
 * @date 2017-12-19.
 */
public class MyFirstTasklet implements Tasklet {

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        for (int i=0; i<10;i ++) {
            System.out.println(i);
        }

        return RepeatStatus.FINISHED;
    }
}
