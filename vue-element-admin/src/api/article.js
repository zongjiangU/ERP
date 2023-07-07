import request from '@/utils/request'

export function fetchList(query) {
  return request({
    url: '/vue-element-admin/basicinfo/getList',
    method: 'get',
    params: query
  })
}

export function fetchArticle(id) {
  return request({
    url: '/vue-element-admin/article/detail',
    method: 'get',
    params: { id }
  })
}

export function createBasicInfo(data) {
  return request({
    url: '/vue-element-admin/basicinfo/add',
    method: 'post',
    data
  })
}

export function updateBasicInfo(data) {
  return request({
    url: '/vue-element-admin/basicinfo/update',
    method: 'post',
    data
  })
}

export function deleteBasicInfo(id) {
  return request({
    url: '/vue-element-admin/basicinfo/delete',
    method: 'get',
    params: { id }
  })
}
