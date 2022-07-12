package paydemo.util;

import com.google.common.base.Joiner;

/**
 * @auther YDXiaa
 * <p>
 * redis key创建.
 */
public final class KeyCreator {

    /**
     * 生成Redis Key.
     *
     * @param key key.
     * @return key.
     */
    public static String createRedisKey(final String... key) {

        return Joiner.on("_").join(key);
    }

    /**
     * 创建Key.
     *
     * @param key key[].
     * @return key.
     */
    public static String createKey(final String... key) {
        return createRedisKey(key);
    }
}
