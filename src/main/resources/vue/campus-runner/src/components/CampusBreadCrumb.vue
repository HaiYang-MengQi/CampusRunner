<script>

</script>

<template>
  <el-breadcrumb separator-class="el-icon-arrow-right" class="breadcrumb breadcrumb-container">
    <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
    <el-breadcrumb-item>后台管理</el-breadcrumb-item>
    <el-breadcrumb-item>登陆人员</el-breadcrumb-item>
    <el-breadcrumb-item>后台分析</el-breadcrumb-item>
  </el-breadcrumb>
</template>

<style>
.breadcrumb-container {
  display: flex;
  align-items: center;
  margin-left: 10px;
  height: 100%; /* 你可以根据需要调整高度 */
}

.breadcrumb {
  font-size: 15px;
  color: #b31f1c;
}
</style>