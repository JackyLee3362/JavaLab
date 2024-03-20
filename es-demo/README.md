# Elastic Search Demo 项目

## 启动项目

1. 进入 `es-demo` 目录 `cd es-demo`
2. 启动 docker，并输入
```sh
docker run -d --name es -e "ES_JAVA_OPTS=-Xms512m -Xmx512m" -e "discovery.type=single-node" -v ${pwd}/es-data:/usr/share/elasticsearch/data -v ${pwd}/es-plugins:/usr/share/elasticsearch/plugins --privileged --network es-net -p 9200:9200 -p 9300:9300 elasticsearch:7.12.1
```
```sh
docker run -d --name es -e "ES_JAVA_OPTS=-Xms512m -Xmx512m" -e "discovery.type=single-node" -v d:/es-tmp/es-data:/usr/share/elasticsearch/data -v d:/es-tmp/es-plugins:/usr/share/elasticsearch/plugins --privileged --network es-net -p 9200:9200 -p 9300:9300 elasticsearch:7.12.1
```
3. 解压 res 目录中的 ik 分词器插件，放入 es-plugins 中
4. 更改 `es-data` 和 `es-plugins` 的权限，改为已读
5. 重启 docker 中的 es 项目
6. mysql 执行 `res/tb_hotel.sql`

启动 mq 项目

第四步： 打开 mysql，创建 heima 数据库，执行 tb_hotel.sql 文件

第五步： 启动 springboot 项目
