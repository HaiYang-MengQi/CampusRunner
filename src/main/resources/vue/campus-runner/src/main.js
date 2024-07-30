import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import CampusBreadCrumb from './components/CampusBreadCrumb.vue'
Vue.use(ElementUI);
Vue.component('BreadCrumb',CampusBreadCrumb)
new Vue({
  render: h => h(App),
}).$mount('#app')
