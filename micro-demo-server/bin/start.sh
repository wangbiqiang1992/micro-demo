#!/usr/bin/env bash
SERVER=/app/micro-demo

cd ${SERVER}
JAR=*.jar

#SpringBoot启动环境
ENV_NAME=$2

#堆内存最大2G,最小1G,线程堆栈4m
JAVA_OPTS="-Xmx2G -Xms1G -Xss4m -Xmn=512m"

#DEBUG启动
if [ "$3"="debug" ];then
DEBUG_OPTS = "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=9000"
else
DEBUG_OPTS = ""
fi

start(){
   LOG=${SERVER}/logs/all.log
   echo "start project begin..." >> ${LOG}
   cd ${SERVER}
   classPath="."
   nohup java ${JAVA_OPTS} ${DEBUG_OPTS} -jar ${SERVER}/${JAR} --spring.profiles.active=${ENV_NAME} >/dev/null 2>&1 &
   echo $! > ${SERVER}/server.pid
   echo "start project end..." >> ${LOG}
}

stop(){
  echo "stop project begin..."
  kill `cat ${SERVER}/server.pid`
  rm -rf ${SERVER}/server.pid
  echo "start project begin..."
}

restart(){
    stop
    sleep 1
    start
}

if [ "$1"="start" ]; then
    start
elif [ "$1"="stop" ]; then
    stop
elif [ "$1"="restart" ];then
    restart
else
    restart
fi


