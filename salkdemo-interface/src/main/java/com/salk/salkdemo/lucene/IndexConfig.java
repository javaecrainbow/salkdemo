
    package com.salk.salkdemo.lucene;    
      
    import java.util.HashSet;  
      
    /**
     * @author salk
     * @Description: 索引的相关配置参数   
     * 2015年6月14日
     */
    public class IndexConfig {  
        //配置参数  
        private static HashSet<ConfigBean> configBean = null;  
          
        //默认的配置  
        private static class LazyLoadIndexConfig {  
            private static final HashSet<ConfigBean> configBeanDefault = new HashSet<ConfigBean>();  
             static {  
                 ConfigBean configBean = new ConfigBean();  
                 configBeanDefault.add(configBean);  
             }  
        }  
      
        public static HashSet<ConfigBean> getConfigBean() {  
            //如果未对IndexConfig初始化，则使用默认配置  
            if (configBean == null) {  
                configBean = LazyLoadIndexConfig.configBeanDefault;  
            }  
            return configBean;  
        }  
      
        public static void setConfigBean(HashSet<ConfigBean> configBean) {  
            IndexConfig.configBean = configBean;  
        }  
    }  