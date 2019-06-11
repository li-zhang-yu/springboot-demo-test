#!/usr/bin/env bash

#echo "hello world!"
#echo "123456"

demoFun(){
 # 拉取镜像
 sudo docker push registry.cn-hangzhou.aliyuncs.com/lizhangyu/springboot-demo-test:v2
 #运行镜像并删除容器
 sudo docker run -p 8080:8080 --rm=true -it registry.cn-hangzhou.aliyuncs.com/lizhangyu/springboot-demo-test:v2
}

demoFun