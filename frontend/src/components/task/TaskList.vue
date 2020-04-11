<template>
    <div class="task-list">
        <h1>{{name}}</h1>
    </div>
</template>

<script lang="ts">
    import {Component, Vue} from "vue-property-decorator";

    @Component
    export default class TaskList extends Vue {
        private name = "TaskList"
    }
</script>

<style scoped>

</style>