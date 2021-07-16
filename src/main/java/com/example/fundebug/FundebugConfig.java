package com.example.fundebug;

import com.fundebug.Fundebug;
import com.fundebug.SpringConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author lizhenjiang
 */
@Configuration
@Import(SpringConfig.class)
public class FundebugConfig {

    public Fundebug getBean() {
        return new Fundebug("95f9770350f7b78621087fd16c587269d017b3f8f50e4ff5681a311c13d0e917");
    }
}
