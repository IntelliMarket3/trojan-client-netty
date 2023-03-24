package com.kdyzm.trojan.client.netty.properties;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author rusheng(Vaskka)
 * datetime: 2023/3/25_1:08
 */
@Slf4j
@Component("defaultPacFileDataProviderImpl")
public class DefaultPacFileDataProviderImpl implements PacFileDataProvider {
    @Override
    public InputStream getInputStream(String path) {
        try {
            return new FileInputStream(path);
        } catch (FileNotFoundException e) {
            log.error("file not exist");
            throw new RuntimeException(e);
        }
    }
}
