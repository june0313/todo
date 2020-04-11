<template>
    <div class="project-list">
        <h1>{{name}}</h1>
    </div>
</template>

<script lang="ts">
    import {Component, Prop, Vue} from "vue-property-decorator";

    @Component
    export default class ProjectList extends Vue {
        @Prop()
        private name = 'project-list';
    }
</script>

<style scoped>

</style>