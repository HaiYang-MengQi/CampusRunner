<script>
  export default {
    data() {
      return {
        list: [
          {
            title: '1',
            img: '苍江',
            url: require('@/assets/mountain1.jpg')
          },
          {
            title: '2',
            img: '黄山',
            url: require('@/assets/mountain2.jpg')
          },
            {
            title: '3',
            img: '落日',
            url: require('@/assets/bridge.jpg')
          },
            {
            title: '4',
            img: '悬瀑',
            url: require('@/assets/river.jpg')
          },
        ]
      }
    },
    created() {
      console.log(1111)
    },
    mounted(){

    }
  }
</script>

<template>
  <el-container>
    <el-header style="padding: 0;">
      <BreadCrumb></BreadCrumb>
    </el-header>
    <el-main style="padding: 0;">
      <el-carousel :interval="2000" type="card" style="height: 570px">
        <el-carousel-item v-for="item in list" :key="item.title" style="height: auto;">
          <el-image
              :src="item.url"
              :preview-src-list="[item.url]"
              fit="cover"
          ></el-image>
          <h3 class="medium" style="text-align: center">{{item.img}}</h3>
        </el-carousel-item>
      </el-carousel>
    </el-main>

  </el-container>
</template>

<style>
.el-carousel__container{
  position: relative;
  height: 900px;
}
</style>