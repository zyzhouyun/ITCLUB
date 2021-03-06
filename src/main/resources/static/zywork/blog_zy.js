/**
 * 周云
 */


//alert(11)



Vue.http.options.emulateJSON = true
const vm = new Vue({
    el:'#doc-container',
    data:{
        page:{},
        blogTypes:[],
        keyword:'',
        pageNum:'',
        blogTypeId:'',
        hotblogs:[],
    },
    methods:{
        timestampToDate(timestamp){
            var date = new Date(timestamp);
            Y = date.getFullYear() + '-';
            M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
            D = date.getDate() + ' ';
            h = date.getHours() + ':';
            m = date.getMinutes()
            return Y+M+D+h+m
        },
        timestampToTime(timestamp) {
            var date = new Date(timestamp);
            Y = date.getFullYear() + '-';
            M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
            D = date.getDate() + ' ';
            h = date.getHours() + ':';
            m = date.getMinutes() + ':';
            s = date.getSeconds();
            return Y+M+D+h+m+s
        },
        initCustomBlog(){
            let url='/blog/findBlog'
            this.$http.get(url).then((res)=>{
                if(res.body.code==200){
                    console.log(res.body.data)
                    this.page=res.body.data
                }else{
                    alert(res.body.message)
                }
            },(err)=>{
                console.log(err)
            })
        },
        initBlogType(){
            let url='/type/getBlogTypes'
            this.$http.get(url).then((res)=>{
                if(res.body.code==200){
                    this.blogTypes = res.body.data
                }else{
                    alert(res.body.message)
                }
            },(err)=>{
                console.log(err)
            })
        },
        getBlog(typeid){
            this.blogTypeId=typeid //保存类型，供后面使用
            let url='/blog/findBlog'
            this.$http.post(url,{
                "blogType.typeid":typeid
            }).then((res)=>{
                if(res.body.code==200){
                    this.page = res.body.data
                }else{
                    alert(res.body.message)
                }
            },(err)=>{
                //console.log(err)
            })
        },
        search(){
            let url='/blog/findBlog?blogTitle='+this.keyword
            this.$http.get(url).then((res)=>{
                if(res.body.code==200) {
                    this.page = res.body.data
                }else{
                    alert(res.body.message)
                }
            })
        },
        pager($pageNum){
            //跳转的时候带上页数，  与类型，不会会算成全部类型
            let url='/blog/findBlog?pageNum='+($pageNum==0?1:$pageNum)+'&blogType.typeid='+this.blogTypeId
            this.$http.get(url).then((res)=>{
                //alert($pageNum)
                if(res.body.code==200){
                    console.log(res.body.data)
                    this.page=res.body.data
                }else{
                    alert(res.body.message)
                }
            },(err)=>{
                console.log(err)
            })
        },
        ref:function () {
            var reg=/^[1-9][0-9]{0,2}$/
            if(!reg.test(this.pageNum)){
                this.pageNum=''
                alert('请输入1-3位正整数')
                this.$refs.num.focus()
                return false
            }else if(this.pageNum>this.page.pages){
                this.pageNum=''
                alert('抱歉！找不到此页')
                this.$refs.num.focus()
                return false
            }
            this.$http.post('/blog/findBlog',
                {"pageNum":this.pageNum}).then(function (res) {
                this.page=res.body.data
                this.pageNum=''
                this.$refs.num.focus()
            })
        },
        getHotBlogs(){
            let url='/blog/hot'
            this.$http.get(url).then((res)=>{
                if(res.body.code==200) {
                    this.hotblogs = res.body.data
                }else{
                    alert(res.body.message)
                }
            })
        },
        },
    created(){
        this.initCustomBlog()
        this.initBlogType()
        this.getHotBlogs()
    },
})