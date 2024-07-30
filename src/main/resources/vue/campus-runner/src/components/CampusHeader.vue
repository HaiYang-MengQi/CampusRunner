<script>
export default {
    data(){
      return {
          status : false,
      }
    },
    methods : {
      changeStatus(){
        this.status = ! this.status;
      }
    }
}
</script>
<template>
    <el-menu :collapse="status" :default-active="'1'" style="width:auto">
      <el-menu-item index="1">
          <i class="el-icon-s-home icon" @mouseup="changeStatus"></i>
          <span slot="title">首页</span>
        </el-menu-item>
      <el-submenu index="2">
        <template slot="title" >
          <i class="el-icon-chat-dot-round"></i>
          <span slot="title">消息</span>
        </template>
          <el-menu-item index="2-1">水果</el-menu-item>
          <el-menu-item index="2-2">蔬菜</el-menu-item>
      </el-submenu>
        <el-menu-item index="3">
          <i class="el-icon-service"></i>
          <span slot="title">客服</span>
        </el-menu-item>
        <el-menu-item index="4">
          <i class="el-icon-download">
          </i><span slot="title">下载</span>
        </el-menu-item>
        <el-menu-item index="5">
          <i class="el-icon-user"></i>
          <span slot="title">用户</span>
        </el-menu-item>
      <el-menu-item index="6">
          <i class="el-icon-setting"></i>
          <span slot="title">设置</span>
      </el-menu-item>
    </el-menu>
</template>
<style>

.icon {
  font-size: 1px; /* 设置图标的大小 */
}

</style>