package com.kvlt.boot.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryContext;
import org.springframework.retry.RetryListener;

/**
 * RetryFailuireItemListener
 *
 * @author KVLT
 * @date 2017-12-19.
 */
public class RetryFailuireItemListener implements RetryListener {

    private static final Logger logger = LoggerFactory.getLogger(RetryFailuireItemListener.class);

    @Override
    public <T, E extends Throwable> boolean open(RetryContext context, RetryCallback<T, E> callback) {
        return false;
    }

    @Override
    public <T, E extends Throwable> void close(RetryContext context, RetryCallback<T, E> callback, Throwable throwable) {

    }

    @Override
    public <T, E extends Throwable> void onError(RetryContext context, RetryCallback<T, E> callback, Throwable throwable) {
        logger.error("【重试异常】："+throwable.getMessage());
    }
}
