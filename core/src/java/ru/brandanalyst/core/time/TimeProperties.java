package ru.brandanalyst.core.time;

/**
 * Класс, отвечающий за время последней ревизии из новостей
 * Created by IntelliJ IDEA.
 * User: dima
 * Date: 10/29/11
 * Time: 9:08 PM
 */
public abstract class TimeProperties {
    /**
     * время последней ревизии новостей
     */
    public final static long TIME_LIMIT = (long) (13174128) * (long) (100000);
    public final static long SINGLE_DAY = (long) 86400000;
}
