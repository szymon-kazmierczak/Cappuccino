package com.metova.cappuccino;

public class Cappuccino {

    private static final CappuccinoResourceWatcher NO_OP_RESOURCE_WATCHER = new CappuccinoResourceWatcher();

    public static CappuccinoResourceWatcher newIdlingResourceWatcher(Object ignored) {
        return NO_OP_RESOURCE_WATCHER;
    }

    public static CappuccinoResourceWatcher newIdlingResourceWatcher(String ignored) {
        return NO_OP_RESOURCE_WATCHER;
    }

    public static String nameOf(Object ignored) {
        return "";
    }

    public static CappuccinoResourceWatcher getResourceWatcher(Object ignored) {
        return NO_OP_RESOURCE_WATCHER;
    }

    public static CappuccinoResourceWatcher getResourceWatcher(String ignored) {
        return null;
    }

    public static void registerIdlingResource(Object ignored) {
    }

    public static void registerIdlingResource(String ignored) {
    }

    public static void unregisterIdlingResource(Object ignored) {
    }

    public static void unregisterIdlingResource(String ignored) {
    }

    private static boolean isTesting() {
        return false;
    }

    public static void setIsTesting(boolean ignored) {
    }

    public static void reset() {
    }
}