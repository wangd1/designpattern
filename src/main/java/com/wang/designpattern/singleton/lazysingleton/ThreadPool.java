package com.wang.designpattern.singleton.lazysingleton;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author wangd1
 */
public class ThreadPool {
    private static final ThreadFactory NAME_FACTORY =
            new ThreadFactoryBuilder().setNameFormat("thread-call-%d").build();

    private static final ExecutorService THREAD_POOL = new ThreadPoolExecutor(
            10,500,60L, TimeUnit.SECONDS,
            new SynchronousQueue<>(),NAME_FACTORY,new ThreadPoolExecutor.CallerRunsPolicy());
}
