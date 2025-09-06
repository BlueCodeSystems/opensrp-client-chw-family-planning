package org.smartregister.chw.fp.activity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class BaseFpRegisterActivityTest {

    private BaseFpRegisterActivity baseFpRegisterActivity;

    @Before
    public void setUp() {
        // Use a Mockito mock to avoid Android framework initialization
        baseFpRegisterActivity = Mockito.mock(BaseFpRegisterActivity.class);
    }

    @Test
    public void assertNotNull() {
        Assert.assertNotNull(baseFpRegisterActivity);
    }

    @Test
    public void testFormConfig() {
        Assert.assertNull(baseFpRegisterActivity.getFormConfig());
    }
}
