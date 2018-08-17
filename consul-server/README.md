consul是google开源的一个使用go语言开发的服务发现、配置管理中心服务。内置了服务注册与发现框架、分布一致性协议实现、健康检查、Key/Value存储、多数据中心方案，不再需要依赖其他工具（比如ZooKeeper等）。

# 单节点consul安装、运行
## 安装
访问[Consul下载页](https://www.consul.io/downloads.html)获取最新版本下载地址。  
Consul最新版本(Mac)的下载地址:
`https://releases.hashicorp.com/consul/1.2.2/consul_1.2.2_darwin_amd64.zip`
下载，然后unzip解压，得到执行文件
```shell
curl -O https://releases.hashicorp.com/consul/1.2.2/consul_1.2.2_darwin_amd64.zip
unzip consul_1.2.2_darwin_amd64.zip
cp consul /usr/local/bin
```
查看是否安装成功
```shell
consul
```
出现如下结果，表示安装成功
```
Usage: consul [--version] [--help] <command> [<args>]

Available commands are:
    agent          Runs a Consul agent
    catalog        Interact with the catalog
    connect        Interact with Consul Connect
    event          Fire a new event
    exec           Executes a command on Consul nodes
    force-leave    Forces a member of the cluster to enter the "left" state
    info           Provides debugging information for operators.
    intention      Interact with Connect service intentions
    join           Tell Consul agent to join cluster
    keygen         Generates a new encryption key
    keyring        Manages gossip layer encryption keys
    kv             Interact with the key-value store
    leave          Gracefully leaves the Consul cluster and shuts down
    lock           Execute a command holding a lock
    maint          Controls node or service maintenance mode
    members        Lists the members of a Consul cluster
    monitor        Stream logs from a Consul agent
    operator       Provides cluster-level tools for Consul operators
    reload         Triggers the agent to reload configuration files
    rtt            Estimates network round trip time between nodes
    snapshot       Saves, restores and inspects snapshots of Consul server state
    validate       Validate config files/directories
    version        Prints the Consul version
    watch          Watch for changes in Consul
```

```
consul agent -server -bootstrap-expect 1 -ui -node=consulserver -bind=0.0.0.0 -datacenter=dc1 -data-dir /tmp/consul
```
## 启动

# consul集群搭建

# consul与Docker
