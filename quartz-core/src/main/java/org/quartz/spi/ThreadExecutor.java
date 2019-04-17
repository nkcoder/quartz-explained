package org.quartz.spi;

/**
 * Allows different strategies for scheduling threads. The {@link #initialize()}
 * method is required to be called before the first call to
 * {@link #execute(Thread)}. The Thread containing the work to be performed is
 * passed to execute and the work is scheduled by the underlying implementation.
 *
 * 使用不同的策略执行调度线程
 *
 * 只有一种实现，即默认实现{@link org.quartz.impl.DefaultThreadExecutor}
 *
 * @author matt.accola
 * @version $Revision$ $Date$
 */
public interface ThreadExecutor {

    /**
     * Submit a task for execution
     *
     * @param thread the thread to execute
     */
    void execute(Thread thread);

    /**
     * Initialize any state prior to calling {@link #execute(Thread)}
     */
    void initialize();
}
