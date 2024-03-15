package top.srcres.mods.palmc.util;

import org.slf4j.Logger;
import top.srcres.mods.palmc.PalMC;

/**
 * Utility class to make convenience for mod-level logging.
 */
public class LogHelper {
    public static Logger getLogger() {
        return PalMC.getInstance().getModLogger();
    }

    // ----- trace logs -----
    public static void trace(String msg) {
        getLogger().trace(msg);
    }
    public static void trace(String format, Object arg) {
        getLogger().trace(format, arg);
    }
    public static void trace(String format, Object arg1, Object arg2) {
        getLogger().trace(format, arg1, arg2);
    }
    public static void trace(String format, Object... arguments) {
        getLogger().trace(format, arguments);
    }
    public static void trace(String msg, Throwable t) {
        getLogger().trace(msg, t);
    }

    // ----- debug logs -----
    public static void debug(String msg) {
        getLogger().debug(msg);
    }
    public static void debug(String format, Object arg) {
        getLogger().debug(format, arg);
    }
    public static void debug(String format, Object arg1, Object arg2) {
        getLogger().debug(format, arg1, arg2);
    }
    public static void debug(String format, Object... arguments) {
        getLogger().debug(format, arguments);
    }
    public static void debug(String msg, Throwable t) {
        getLogger().debug(msg, t);
    }


    // ----- info logs -----
    public static void info(String msg) {
        getLogger().info(msg);
    }
    public static void info(String format, Object arg) {
        getLogger().info(format, arg);
    }
    public static void info(String format, Object arg1, Object arg2) {
        getLogger().info(format, arg1, arg2);
    }
    public static void info(String format, Object... arguments) {
        getLogger().info(format, arguments);
    }
    public static void info(String msg, Throwable t) {
        getLogger().info(msg, t);
    }

    // ----- warn logs -----
    public static void warn(String msg) {
        getLogger().warn(msg);
    }
    public static void warn(String format, Object arg) {
        getLogger().warn(format, arg);
    }
    public static void warn(String format, Object arg1, Object arg2) {
        getLogger().warn(format, arg1, arg2);
    }
    public static void warn(String format, Object... arguments) {
        getLogger().warn(format, arguments);
    }
    public static void warn(String msg, Throwable t) {
        getLogger().warn(msg, t);
    }

    // ----- error logs -----
    public static void error(String msg) {
        getLogger().error(msg);
    }
    public static void error(String format, Object arg) {
        getLogger().error(format, arg);
    }
    public static void error(String format, Object arg1, Object arg2) {
        getLogger().error(format, arg1, arg2);
    }
    public static void error(String format, Object... arguments) {
        getLogger().error(format, arguments);
    }
    public static void error(String msg, Throwable t) {
        getLogger().error(msg, t);
    }

    // ----- abbreviations -----
    public static void t(String msg) {
        trace(msg);
    }
    public static void t(String format, Object arg) {
        trace(format, arg);
    }
    public static void t(String format, Object arg1, Object arg2) {
        trace(format, arg1, arg2);
    }
    public static void t(String format, Object... arguments) {
        trace(format, arguments);
    }
    public static void t(String msg, Throwable t) {
        trace(msg, t);
    }
    public static void d(String msg) {
        debug(msg);
    }
    public static void d(String format, Object arg) {
        debug(format, arg);
    }
    public static void d(String format, Object arg1, Object arg2) {
        debug(format, arg1, arg2);
    }
    public static void d(String format, Object... arguments) {
        debug(format, arguments);
    }
    public static void d(String msg, Throwable t) {
        debug(msg, t);
    }
    public static void i(String msg) {
        info(msg);
    }
    public static void i(String format, Object arg) {
        info(format, arg);
    }
    public static void i(String format, Object arg1, Object arg2) {
        info(format, arg1, arg2);
    }
    public static void i(String format, Object... arguments) {
        info(format, arguments);
    }
    public static void i(String msg, Throwable t) {
        info(msg, t);
    }
    public static void w(String msg) {
        warn(msg);
    }
    public static void w(String format, Object arg) {
        warn(format, arg);
    }
    public static void w(String format, Object arg1, Object arg2) {
        warn(format, arg1, arg2);
    }
    public static void w(String format, Object... arguments) {
        warn(format, arguments);
    }
    public static void w(String msg, Throwable t) {
        warn(msg, t);
    }
    public static void e(String msg) {
        error(msg);
    }
    public static void e(String format, Object arg) {
        error(format, arg);
    }
    public static void e(String format, Object arg1, Object arg2) {
        error(format, arg1, arg2);
    }
    public static void e(String format, Object... arguments) {
        error(format, arguments);
    }
    public static void e(String msg, Throwable t) {
        error(msg, t);
    }
}
