<template>
  <div id="app">
    <ProjectList></ProjectList>
    <TaskList></TaskList>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
import ProjectList from "@/components/project/ProjectList.vue";
import TaskList from "@/components/task/TaskList.vue";

@Component({
  components: {
    TaskList,
    ProjectList
  },
})
export default class App extends Vue {}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
