<template>

    <v-data-table
        :headers="headers"
        :items="orderHistory"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'OrderHistoryView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            orderHistory : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/orderHistories'))

            temp.data._embedded.orderHistories.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.orderHistory = temp.data._embedded.orderHistories;
        },
        methods: {
        }
    }
</script>

