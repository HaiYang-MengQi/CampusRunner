<template>
  <el-container>
    <CampusHeader></CampusHeader>
    <CampusCarousel></CampusCarousel>
  </el-container>

</template>
<script>
import CampusHeader from './components/CampusHeader.vue'
import CampusCarousel from './components/CampusCarousel.vue'
export default {
  components:{
    CampusHeader : CampusHeader,
    CampusCarousel : CampusCarousel
  }
  }
</script>
<style>

</style>