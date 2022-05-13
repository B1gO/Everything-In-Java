# Thread

## Creation
* implements Runnable
* extends Thread

### Steps to create and run a thread
1. implement Runnable or extends Thread.
2. override run()
3. t = new MyThread() or t = new Thread(new MyRunnable())
4. t.start()
   1. t.start() will call run()

Actually Thread does also implement Runnable.

Question: can we use lambda for runnable?
* use the @FunctionalInterface
* only one method: public abstract void run();
* so we can use lambda function

## Status
* New：新创建的线程，尚未执行；
* Runnable：运行中的线程，正在执行run()方法的Java代码；
* Blocked：运行中的线程，因为某些操作被阻塞而挂起；
* Waiting：运行中的线程，因为某些操作在等待中；
* Timed Waiting：运行中的线程，因为执行sleep()方法正在计时等待；
* Terminated：线程已终止，因为run()方法执行完毕。

## 线程终止
* 线程正常终止：run()方法执行到return语句返回；
* 线程意外终止：run()方法因为未捕获的异常导致线程终止；
* 对某个线程的Thread实例调用stop()方法强制终止（强烈不推荐使用）。

## 中断线程
