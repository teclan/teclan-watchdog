package teclan.wathdog.services;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import teclan.exec.Executor;
import teclan.wathdog.config.CommonConfig;
import teclan.wathdog.utils.FileUtils;
import teclan.wathdog.utils.ResultUtils;

import java.io.File;

@Service
public class DefaultService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultService.class);
    private static final String APP_ROOT = CommonConfig.getConfig().getString("部署路径");
    private static final String APP_NAME = CommonConfig.getConfig().getString("应用名称");

    public JSONObject doShell(String shell) {
        String batShell = APP_ROOT + File.separator + APP_NAME + File.separator + shell;
        try {
            LOGGER.info("即将执行脚本:{}", batShell);
            if(!FileUtils.exists(new File(shell))){
                throw  new Exception("脚本文件不存在");
            }
            Executor.exec(batShell);
            return ResultUtils.getResult(200, "脚本执行成功,"+batShell);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return ResultUtils.getResult(500, "脚本执行失败,"+batShell, e.getMessage());
        }
    }

    public JSONObject doRestart() {
        return doShell("restart.bat");
    }
}
