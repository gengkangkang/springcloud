package com.gkk.configdisconf.config;
import com.baidu.disconf.client.common.update.IDisconfUpdate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import com.baidu.disconf.client.common.annotations.DisconfUpdateService;

/**
 * @Author:gkk
 * @Remark
 * @Date: Created in 2017/12/21 11:29
 */
@Service
@DisconfFile(filename = "pay_para.properties")
@DisconfUpdateService(classes = { PayPara.class })
public class PayPara implements IDisconfUpdate {
    private Logger logger= LoggerFactory.getLogger(getClass());


    private String flag;
    private String url;

    @DisconfFileItem(name = "flag",associateField="flag")
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @DisconfFileItem(name = "url",associateField="url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "PayPara{" +
                "flag='" + flag + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    @Override
    public void reload() throws Exception {
        logger.info("配置文件更新了！更新为：[{}]",this.toString());
    }
}
