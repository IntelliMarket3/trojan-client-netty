package com.kdyzm.trojan.client.netty.properties;

import java.io.InputStream;

/**
 * @author rusheng(Vaskka)
 * datetime: 2023/3/25_1:08
 */
public interface PacFileDataProvider {
    InputStream getInputStream(String path);
}
