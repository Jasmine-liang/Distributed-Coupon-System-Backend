## 需要启动的服务
- hbase: 需要向里边写入优惠券，反馈信息数据
- mysql: 存储商户信息
- kafka: 连接商户子系统和用户子系统，商户投放优惠券到kafka topic，经过hbase客户端监听反序列化存储在hbase
- redis: 存储优惠券token

## 需要清空的数据:
1. hbase 的四张表 truncate 'pb:passtemplate'
2. mysql 商户数据
3. /tmp/token/ 下面的优惠券 token 数据
4. redis 中的数据: flushall

## 接口测试
1. 创建商户 商户id: 1
    POST: 127.0.0.1:9527/merchants/create
    header: token/imooc-passbook-merchants
   {
   "name" : "hannah",
   "logoUrl": "www.google.com",
   "businessLicenseUrl": "www.google.com",
   "phone": "123456",
   "address": "beijing"
    }
2. 查看商户信息
    GET: 127.0.0.1:9527/merchants/1
    header: token/imooc-passbook-merchants
3. 投放优惠券
    POST: 127.0.0.1:9527/merchants/drop
    header: token/imooc-passbook-merchants
   ```json 
   {"backgroud":2,
   "desc":"asd",
   "end":"2021-01-01",
   "hasToken":false,
   "id":1,
   "limit":10000,
   "start":"2020-01-01",
   "summary":"test",
   "title":"优惠券-1"}
   
   {"backgroud":2,
   "desc":"asd",
   "end":"2021-01-01",
   "hasToken":true,
   "id":1,
   "limit":10000,
   "start":"2020-01-01",
   "summary":"test",
   "title":"优惠券-2"}


```
   