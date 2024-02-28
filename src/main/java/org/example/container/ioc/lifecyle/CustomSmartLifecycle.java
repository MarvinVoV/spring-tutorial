package org.example.container.ioc.lifecyle;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component
public class CustomSmartLifecycle implements SmartLifecycle {
    private boolean isRunning = false;

    @Override
    public void start() {
        System.out.println("CustomSmartLifecycle start");
        isRunning = true;
    }

    @Override
    public void stop() {
        System.out.println("CustomSmartLifecycle stop");
        isRunning = false;
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public boolean isAutoStartup() {
        return SmartLifecycle.super.isAutoStartup();
    }

    @Override
    public void stop(Runnable callback) {
        SmartLifecycle.super.stop(callback);
    }

    // 返回值越小 优先级越高
    @Override
    public int getPhase() {
        return 1;
    }
}
