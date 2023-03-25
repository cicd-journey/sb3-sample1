# Spring Boot 3 サンプルアプリケーション

## nektos/act を利用した GitHub Actions ワークフローのローカル実行

ワークフローを実行するコンテナイメージ`catthehacker/ubuntu:act-latest`にはmavenが入っていないため追加
```
% docker container run -it --name maven3 --platform linux/amd64 catthehacker/ubuntu:act-latest bash
root@e4b57a330805:/tmp# apt update && apt install -y maven
root@e4b57a330805:/tmp# apt exit
% docker commit maven3 maven3:latest
% docker container rm maven3
```

ワークフロー実行
```
% act -P ubuntu-latest=maven3:latest --container-architecture linux/amd64 --artifact-server-path $(pwd)/target/act-artifacts --pull=false
```
